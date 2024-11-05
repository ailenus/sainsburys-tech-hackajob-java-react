
. /projects/app/backend/.hackajob

echo "[+] Setting the ENV variables..."
sed -i 's/^BACKEND_APPLICATION_URL.*$//' /home/user/.bashrc
sed -i 's/^REACT_APP_BACKEND_APPLICATION_URL.*$//' /home/user/.bashrc
BACKEND_APPLICATION_URL=$(curl -X GET --header 'Accept: application/json' --header "Authorization: Bearer $CHE_MACHINE_TOKEN" "$CHE_API_INTERNAL/workspace/$CHE_WORKSPACE_ID?includeInternalServers=false" | jq '.runtime.machines.application.servers.YourBackendApplication.url')
echo "BACKEND_APPLICATION_URL=$BACKEND_APPLICATION_URL" >> /home/user/.bashrc
echo "REACT_APP_BACKEND_APPLICATION_URL=$BACKEND_APPLICATION_URL" >> /home/user/.bashrc

echo "[+] Starting the backend application..."
cd /projects/app/backend/
bash -c "$BUILD_AND_RUN"

sleep 10
